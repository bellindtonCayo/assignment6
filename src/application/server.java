package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class server {

	public static void main(String[] args) {

		//-----------------------instantiate server	
				ServerSocket server = null;
				boolean shutdown = false;
				try
				{
					server = new ServerSocket(1236);
					System.out.println("port bound. Accepting Connections");
					
				} catch (IOException e){
					e.printStackTrace();
					System.exit(-1);
				}	
				
				while(!shutdown) {
					
					Socket client = null;
					InputStream input = null;
					OutputStream output = null;
					String clientInput = null;
					
					try
					{
						client = server.accept();
						input =  client.getInputStream();
						output =  client.getOutputStream();
						
						int n = input.read();
						byte[] data = new byte[n];
						input.read(data);
						
						 clientInput = new String(data, StandardCharsets.UTF_8);
						clientInput.replace("\n", "");
						
						String response1 = "Client said: " + clientInput;
						String site = clientInput;
						
					System.out.println("Client said: " + clientInput);
					
					
		
					
					String response = "Your input was [" +  clientInput + "]" ;
					
					
					output.write(response.length());
					
					output.write(response.getBytes());
				
					
					client.close();
					
					
					if (clientInput.equalsIgnoreCase("shutdown"))
					{
						System.out.println("Shutting down...");
					}
					
				} catch (IOException e){
					e.printStackTrace();
					System.exit(-1);
				
			}
			
				}
				
		}	
						
					



		}

