package com.octest.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListProduit")
public class ListProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListProduit() {
        super();
        // TODO Auto-generated constructor stub
    }


 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 {

	request.setAttribute("data-name-in-jsp", "data to be transfered");
		this.getServletContext().getRequestDispatcher("/WEB-INF/Produit.jsp").forward(request, response);
}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
