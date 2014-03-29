package calculate;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.Friend;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.internal.org.json.JSONArray;
import facebook4j.internal.org.json.JSONException;
import facebook4j.internal.org.json.JSONObject;

/**
 * Servlet implementation class calculate
 */
@WebServlet("/calculate")
public class calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Facebook facebook = (Facebook)request.getSession().getAttribute("facebook");
		try {
			ResponseList<Friend> list = facebook.getFriends();
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Multiple FQL
		Map<String, String> queries = new HashMap<String, String>();
		//queries.put("all friends", "SELECT uid2 FROM friend WHERE uid1=me()");
		queries.put("my name", "SELECT name,music FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500)");
		Map<String, JSONArray> result = null;
		
		
		try {
			result = facebook.executeMultiFQL(queries);
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		JSONArray allFriendsJSONArray = result.get("all friends");
		for (int i = 0; i < allFriendsJSONArray.length(); i++) {
		    JSONObject jsonObject = null;
			
		    try {
				jsonObject = allFriendsJSONArray.getJSONObject(i);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 // Getting user's email address only
			try {
				User user = facebook.getUser((String) jsonObject.get("uid2"));
				System.out.println(user);
			} catch (FacebookException | JSONException e1) {
				// TODO Auto-geneSystem.out.println(jsonObject);rated catch block
				e1.printStackTrace();
			}
			
		}*/
		JSONArray myNameJSONArray = result.get("my name");
		try {
			System.out.println(myNameJSONArray.getJSONObject(0).get("name"));
			System.out.println(myNameJSONArray.getJSONObject(0).get("music"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Map
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("z",30);
		h.put("z", h.get("z")+1);
		h.put("e",10);
		h.put("b",20);
		h.put("c",20);
		
		// Sort Map
		List<Map.Entry> a = new ArrayList<Map.Entry>(h.entrySet());
		Collections.sort(a,
		         new Comparator() {
		             public int compare(Object o1, Object o2) {
		                 Map.Entry e1 = (Map.Entry) o1;
		                 Map.Entry e2 = (Map.Entry) o2;
		                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
		             }
		         });

		request.setAttribute("map", a);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		//ResponseList<Friend> list = facebook.getFriends();
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
