/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.AddPostDao;
import model.dao.PostDao;
import model.pojo.post;

/**
 *
 * @author chawanvtp
 */
public class ViewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    
    
    /**
     *  TODO GET ALL comments for chosen forum setting 2 Attributes( curPost , cList )
     *  curPost = current post
     *  cList = all comments for the chosen post
     *      Dispatch to "view/post_view.jsp"
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        PostDao dao = new PostDao();
        List<post> pList = dao.findAll();

        //Pass pList to target
        RequestDispatcher rd = request.getRequestDispatcher("view/post_view.jsp");
        request.setAttribute("postList",pList);
        rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ViewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
             /**
         *     TODO Posting if detail is filled.
         *      -   Insert New AddCommentDao into post-DB
         *          - data in format [ addOwnerID, addPostDetail, addBounty, addPostTopic , addTarget ]
         */
           AddPostDao addDao = new AddPostDao();
           addDao.Add(Integer.parseInt(request.getParameter("addOwnerID")), request.getParameter("addPostDetail"), Double.parseDouble(request.getParameter("addBounty")) , request.getParameter("addPostTopic"), request.getParameter("addTarget"));
           addDao.close();
        
        
        PostDao dao = new PostDao();
        List<post> pList = dao.findAll();
        
        
        
        //Pass pList to target
        RequestDispatcher rd = request.getRequestDispatcher("view/post_view.jsp");
        request.setAttribute("postList",pList);
        rd.forward(request, response);
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ViewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
