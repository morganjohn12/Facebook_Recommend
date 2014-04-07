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

		/*********************************************************************************
		 * Queries
		 *********************************************************************************/
		// Multiple FQL
		Map<String, String> queries = new HashMap<String, String>();
		queries.put("music", "SELECT name,music FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500) AND CONTAINS('musician/band')");
		queries.put("movies", "SELECT name,movies FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500)");
		queries.put("tv", "SELECT name,tv FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500)");
		//queries.put("current_location", "SELECT name,current_location FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500)");
		//queries.put("favorite_teams", "SELECT name,favorite_teams FROM user WHERE uid IN (SELECT uid2 FROM friend WHERE uid1 = me() LIMIT 500)");
		Map<String, JSONArray> result = null;
		
		try {
			result = facebook.executeMultiFQL(queries);
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*********************************************************************************
		 * Music
		 *********************************************************************************/
		// Map
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		
		JSONArray allFriendsJSONArray = result.get("music");
		for (int i = 0; i < allFriendsJSONArray.length(); i++)
		{
		    JSONObject jsonObject = null;
		    try 
		    {
				jsonObject = allFriendsJSONArray.getJSONObject(i);
				
				String list = (String) jsonObject.get("music");
				String[] music = list.split("[,]+");
				
				if (music[0] != null && music[0].length() != 0)
				{
					//System.out.println("\nNAME: " + jsonObject.get("name"));
					//System.out.println(music.length);
				
					for (int j = 0; j < music.length; j++)
					{
						music[j] = music[j].trim();
						//System.out.println(music[j]);
						if (m.get(music[j]) != null)
							m.put(music[j], (m.get(music[j]) + 1));
						else
							m.put(music[j], 1);
					}
				}
								
			} catch (JSONException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Sort Map
		List<Map.Entry> a = new ArrayList<Map.Entry>(m.entrySet());
		Collections.sort(a,
		         new Comparator() {
		             public int compare(Object o1, Object o2) {
		                 Map.Entry e1 = (Map.Entry) o1;
		                 Map.Entry e2 = (Map.Entry) o2;
		                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
		             }
		         });
		
		// Set music list
		ArrayList<myObject> music = new ArrayList<myObject>();
		for (int k = 0; k < 15; k++)
		{
			String key = (String)a.get(k).getKey();
			int count = (int)a.get(k).getValue();
			myObject item = new myObject(key, count);
			music.add(item);			
		}
		
		/*********************************************************************************
		 * Movies
		 *********************************************************************************/
		// Map
		HashMap<String, Integer> v = new HashMap<String, Integer>();
		
		JSONArray allMoviesJSONArray = result.get("movies");
		for (int i = 0; i < allFriendsJSONArray.length(); i++)
		{
		    JSONObject jsonObject = null;
		    try 
		    {
				jsonObject = allMoviesJSONArray.getJSONObject(i);
				
				String list = (String) jsonObject.get("movies");
				String[] movies = list.split("[,]+");
				
				if (movies[0] != null && movies[0].length() != 0)
				{
					//System.out.println("\nNAME: " + jsonObject.get("name"));
					//System.out.println(music.length);
				
					for (int j = 0; j < movies.length; j++)
					{
						movies[j] = movies[j].trim();
						//System.out.println(music[j]);
						if (v.get(movies[j]) != null)
							v.put(movies[j], (v.get(movies[j]) + 1));
						else
							v.put(movies[j], 1);
					}
				}
								
			} catch (JSONException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Sort Map
		List<Map.Entry> c = new ArrayList<Map.Entry>(v.entrySet());
		Collections.sort(c,
		         new Comparator() {
		             public int compare(Object o1, Object o2) {
		                 Map.Entry e1 = (Map.Entry) o1;
		                 Map.Entry e2 = (Map.Entry) o2;
		                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
		             }
		         });
		
		// Set movie list
		ArrayList<myObject> movies = new ArrayList<myObject>();
		for (int k = 0; k < 15; k++)
		{
			String key = (String)c.get(k).getKey();
			int count = (int)c.get(k).getValue();
			myObject item = new myObject(key, count);
			movies.add(item);			
		}
		
		/*********************************************************************************
		 * TV Shows
		 *********************************************************************************/
		// Map
		HashMap<String, Integer> t = new HashMap<String, Integer>();
		
		JSONArray allTvshowsJSONArray = result.get("tv");
		for (int i = 0; i < allFriendsJSONArray.length(); i++)
		{
		    JSONObject jsonObject = null;
		    try 
		    {
				jsonObject = allTvshowsJSONArray.getJSONObject(i);
				
				String list = (String) jsonObject.get("tv");
				String[] tv = list.split("[,]+");
				
				if (tv[0] != null && tv[0].length() != 0)
				{
					//System.out.println("\nNAME: " + jsonObject.get("name"));
					//System.out.println(music.length);
				
					for (int j = 0; j < tv.length; j++)
					{
						tv[j] = tv[j].trim();
						//System.out.println(music[j]);
						if (t.get(tv[j]) != null)
							t.put(tv[j], (t.get(tv[j]) + 1));
						else
							t.put(tv[j], 1);
					}
				}
								
			} catch (JSONException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Sort Map
		List<Map.Entry> e = new ArrayList<Map.Entry>(t.entrySet());
		Collections.sort(e,
		         new Comparator() {
		             public int compare(Object o1, Object o2) {
		                 Map.Entry e1 = (Map.Entry) o1;
		                 Map.Entry e2 = (Map.Entry) o2;
		                 return ((Comparable) e2.getValue()).compareTo(e1.getValue());
		             }
		         });
		
		// Set tv list
		ArrayList<myObject> tv = new ArrayList<myObject>();
		for (int k = 0; k < 15; k++)
		{
			String key = (String)e.get(k).getKey();
			int count = (int)e.get(k).getValue();
			myObject item = new myObject(key, count);
			tv.add(item);			
		}
		
		/**************************************************************************
		 * Setting Data to Forward
		 **************************************************************************/
		// Pass the data in the map
		request.setAttribute("music", music);
		request.setAttribute("movies", movies);
		request.setAttribute("tv", tv);
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
