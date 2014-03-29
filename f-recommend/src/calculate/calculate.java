package calculate;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.Friend;
import facebook4j.ResponseList;

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
		System.out.println("yay\n");
		Facebook facebook = (Facebook)request.getSession().getAttribute("facebook");
		System.out.println("yay\n");
		
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
