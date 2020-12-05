package org.javaapp.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet("/SelectData")
public class DataServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataService dataService = new DataService();

        String dataType = request.getParameter("Type");

        List dataList = dataService.getAvailableData(dataType);
        Iterator it = dataList.iterator();

        request.setAttribute("data", dataList);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}