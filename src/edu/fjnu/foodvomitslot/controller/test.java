package edu.fjnu.foodvomitslot.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		JSONObject jo = new JSONObject();
		Map<String, String> map1 = new HashMap<String, String>();
        map1.put("customerName", "���");
        map1.put("customerPasswd", "123456");
        JSONArray ja1 = JSONArray.fromObject(map1);
        jo.put("customer", ja1);
        String[] param = new String[2];
        param[0] = "customer";
        param[1] = jo.toString();
        doPost("http://localhost/ssm_demo/customer/1.0/customerLogin",param);
        //String post = sendPost("http://localhost/ssm_demo/customer/1.0/customerLogin",param);
		//System.out.println("post===="+post);
		/*Map<String,Object> m = new HashMap<String,Object>();
		try {
			doPut("http://localhost/ssm_demo/blog/32",m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣");
		}*/
		
	}

	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// ����POST�������������������
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// ��ȡURLConnection�����Ӧ�������
			out = new PrintWriter(conn.getOutputStream());
			// �����������
			out.print(param);
			// flush������Ļ���
			out.flush();
			
			// ����BufferedReader����������ȡURL����Ӧ
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			
			while ((line = in.readLine()) != null) {
				System.out.println("result==="+result);
				result += line;
			}
		} catch (Exception e) {
			System.out.println("���� POST ��������쳣��" + e);
			e.printStackTrace();
		}
		// ʹ��finally�����ر��������������
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	public static String sendGet(String url, String param) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlNameString = url + "?" + param;
			URL realUrl = new URL(urlNameString);
			// �򿪺�URL֮�������
			URLConnection connection = realUrl.openConnection();
			// ����ͨ�õ���������
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// ����ʵ�ʵ�����
			connection.connect();
			// ��ȡ������Ӧͷ�ֶ�
			Map<String, List<String>> map = connection.getHeaderFields();
			// �������е���Ӧͷ�ֶ�
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// ���� BufferedReader����������ȡURL����Ӧ
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("����GET��������쳣��" + e);
			e.printStackTrace();
		}
		// ʹ��finally�����ر�������
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	private static String prepareParam(Map<String, Object> paramMap) {
		StringBuffer sb = new StringBuffer();
		if (paramMap.isEmpty()) {
			return "";
		} else {
			for (String key : paramMap.keySet()) {
				String value = (String) paramMap.get(key);
				if (sb.length() < 1) {
					sb.append(key).append("=").append(value);
				} else {
					sb.append("&").append(key).append("=").append(value);
				}
			}
			return sb.toString();
		}
	}

	/**
	 * PUT������
	 *
	 * @param url
	 *            �����ַ
	 * @param values
	 *            �ύ����
	 * @return byte[] ����ɹ���Ľ��
	 */
	public static void doPut(String urlStr, Map<String, Object> paramMap)
			throws Exception {
		URL url = new URL(urlStr);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("PUT");
		String paramStr = prepareParam(paramMap);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		OutputStream os = conn.getOutputStream();
		os.write(paramStr.toString().getBytes("utf-8"));
		os.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;
		String result = "";
		while ((line = br.readLine()) != null) {
			result += "/n" + line;
		}
		System.out.println(result);
		br.close();

	}
	
	private static void doPost(String url,String[] param){
		try {
		    /** post��ʽ */
		    HttpClient client = new HttpClient();
		    PostMethod postMethod = new PostMethod(url);
		    // ��������
		    postMethod.setParameter(param[0],param[1]);
		    // ִ��postMethod
		    client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
		    // ִ�в�����״̬��
		    int status = client.executeMethod(postMethod);
		    System.out.println("status==="+status);
		    byte[] getUrl = postMethod.getResponseBody();
		    System.out.println("geturl ==="+new String(getUrl));
		    
		} catch (Exception e) {
		    // TODO Auto-generated catch block
			 System.out.println("geturl mmm");
		    e.printStackTrace();
		}
	}
}
