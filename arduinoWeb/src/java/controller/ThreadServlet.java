/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.dao.AddCommentDao;
import model.dao.PostDao;
import model.dao.ThreadDao;
import model.pojo.comment;
import model.pojo.post;

/**
 *
 * @author chawanvtp
 */
public class ThreadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    
    /**
     *  TODO GET ALL comments for chosen forum setting 2 Attributes( curPost , cList )
     *  curPost = current post
     *  cList = all comments for the chosen post
     *      Dispatch to "view/tread_view.jsp"
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        int curPID = Integer.parseInt(request.getParameter("pid"));
        request.getSession().setAttribute("pid",curPID);
        
        ThreadDao dao = new ThreadDao();
        post curPost = new PostDao().find(curPID);
        List<comment> cList = dao.findAll(curPID); 
        
        //Pass cList AND currentPost to target
        RequestDispatcher rd = request.getRequestDispatcher("view/thread_view.jsp");
        request.setAttribute("commentList",cList);
        request.setAttribute("curPost",curPost);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            int curPID = Integer.parseInt(request.getParameter("addPID"));
        
        
        /**
         *     TODO Comment if addCommentdetail is filled.
         *      -   Insert New AddCommentDao into post-DB
         *          - data in format [ addPostID , addDetail , addUserID , addUserName ]
         */

           AddCommentDao addDao = new AddCommentDao();
           addDao.Comment(curPID, request.getParameter("addCommentDetail") , Integer.parseInt(request.getParameter("addUserID")), request.getParameter("addUserName"));
           addDao.close();
           
        //Pass cList AND currentPost to target
         ThreadDao dao = new ThreadDao();
        post curPost = new PostDao().find(curPID);
        List<comment> cList = dao.findAll(curPID);
        
        RequestDispatcher rd = request.getRequestDispatcher("view/thread_view.jsp");
        request.setAttribute("commentList",cList);
        request.setAttribute("curPost",curPost);
        rd.forward(request, response);
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThreadServlet.class.getName()).log(Level.SEVERE, null, ex);
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
