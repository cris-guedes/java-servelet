/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelets;

import Dao.StatisticsDao;
import Entities.LastResult;
import Entities.Player;
import Entities.Score;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 55459
 */
@WebServlet(name = "Jogada", urlPatterns = {"/jogada"})
public class Jogada extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        
        Player playerLogged = (Player) getServletContext().getAttribute("PlayerLogged");
        
        StatisticsDao statistcDao = (StatisticsDao) getServletContext().getAttribute("StastiticDAO");
        
        int playerChoose = Integer.parseInt(request.getParameter("jogada"));
        
        int computerChoose = Jogada();
        
        int result = whoWin(playerChoose,computerChoose);
        
        statistcDao.update(playerLogged, result);
        
        LastResult lastResult = new LastResult(computerChoose,playerChoose,result);
        
        
        getServletContext().setAttribute("lastResult", lastResult);
        
        response.sendRedirect("result.jsp");
        }catch(Exception error){
            System.out.println(error);
        }
    }

    public int  whoWin(int escolhaJogador,int numeroSorteio ) {
        int result;
        if (escolhaJogador == 1 && numeroSorteio == 3 || escolhaJogador == 2 && numeroSorteio == 1
                || escolhaJogador == 3 && numeroSorteio == 2) {

            result =1;
        } else if (numeroSorteio == 1 && escolhaJogador == 3 || numeroSorteio == 2 && escolhaJogador == 1
                || numeroSorteio == 3 && escolhaJogador == 2) {

           result =0;

        } else {
           result =3;
        }
        return result;
    }

    public int Jogada() {
        Random random = new Random();
        int jogada = random.nextInt(3);

        return jogada;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
