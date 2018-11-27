package controller;

import java.io.IOException;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MachoDAO;
import modelo.macho;

/**
 * Servlet implementation class MachoController
 */
@WebServlet(description = "Administra peticiones para la tabla Machos", urlPatterns = { "/machos" })
public class MachoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MachoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String opcion = request.getParameter("opcion");
		if (opcion.equals("crear")) {
			System.out.println("Usted a Precionado la Opcion Crear");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/crear.jsp");
			requestDispatcher.forward(request, response);
			
		}else if (opcion.equals("listar")) {
			System.out.println("Usted a Precionado la Opcion Listar");
		}
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = request.getParameter("opcion");
		java.util.Date fechaActual = new Date(0);
		
		MachoDAO machoDAO = new MachoDAO();
		macho macho = new macho();
		macho.setNom_mach(request.getParameter("nombre"));
		//macho.setNum_mach(Integer.parseInt(request.getParameter("numero")));
		//macho.setSex_mach(request.getParameter("sexo"));
		//macho.setEdad_mach(request.getParameter("edad"));
		//macho.setFecha_reg(new java.sql.Date(fechaActual.getTime()));
		//macho.setFecha_nac(SimpleDateFormat(request.getParameter("fechanac")));
		
		try {
			machoDAO.guardar(macho);
			System.out.println("Registro Guardado Satisfactoriamente...");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// doGet(request, response);
	}

}
