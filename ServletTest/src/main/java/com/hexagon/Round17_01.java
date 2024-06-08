package com.hexagon;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round17_01 extends HttpServlet {
	
	private File image;
	
	public void init() {
		ServletContext context = this.getServletContext();
		String path = context.getRealPath("/images");
		image = new File(path, "pnts.png");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("image/png");   // MIME가 png
		
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(image)));
		ServletOutputStream out = res.getOutputStream();
		
		byte[] data = new byte[512];
		
		while(true) {
			int x = in.read(data,0,data.length);
			if(x == -1) break;
			out.write(data,0,x);
			out.flush();
			
		}
		in.close();
		out.close();
	}

}
