package cn.vcredit.surfing.cashcredit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nicholas.fastmedicineserver.CashcreditApplication;

import sun.net.www.http.HttpClient;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CashcreditApplication.class)
@WebAppConfiguration
public class CashcreditApplicationTests {

	// private final String preifx_url = "http://www.vcash.cn/esurfing";
	private final String prefix_url = "http://localhost:8080/surfing_cash";

	// @Test
	// public void contextLoads() {

	// String result =
	// sendPost(preifx_url+"/cash/order/prerepayment/submit","app=123&req={\"cust_id\": \"13052319599\"}");
	// String result = sendPost(preifx_url+"/cash/order/prerepayment/submit",
	// "app=123&req={\"order_id\":\"1\",\"cust_id\": \"13052319599\",\"repayment_amount\": \"13052319599\",\"surfing_deductkey\": \"13052319599\",\"req_time\": \"13052319599\"}");
	//
	// String result = sendPost(preifx_url+"/cash/order/repayschedule",
	// "app=123&req={\"cust_id\":\"18134513899\",\"order_id\":\"135\"}");
	// String result = sendPost(prefix_url+"/cash/order/uncleared",
	// "app=123&req={\"cust_id\":\"18134513899\",\"order_id\":\"135\"}");
	// "app=123&req={\"cust_id\":\"18134513899\"}");
	// "app=123&req={\"cust_id\":\"18134513899\",\"page_size\":\"20\",\"page_index\":\"1\"}");

	//
	// System.err.println(result);
	// }

	// test URL=/cash/bindcards
	/**
	 * 1.applid = "123"
	 * */
	@Test
	public void testCashBindcards() {
		String url = prefix_url + "/cash/order/all";
		String appid = "123";
		String custid = "18134513896";
		String signDate = "2015-07-02 16:14:05";
		String cardHolder = "李灏";
		String cardNo = "111135511";
		String cardBank = "2";
		String cardBankName = "1000";
		// String param = "app=" +appid +"&req={\"cust_id\":"+ "\"" +custid +
		// "\","
		// + "\"sign_date\":" + "\""+ signDate + "\","
		// + "\"card_holder\":"
		// + "\""+ cardHolder + "\","
		// + "\"card_no\":" + "\""+ cardNo + "\","
		// + "\"card_bank\":" + "\""+ cardBank + "\","
		// + "\"card_bankname\":" + "\""+ cardBankName + "\""
		// +"}";

		String param = "?app=123&req={\"cust_id\":\"18134513899\",\"page_size\":20,\"page_index\":1}";

		System.err.println(url + param);
		//String result = sendPost(url, param);
		// String key = new
		// String(this.getParameter("filterVals").getBytes("ISO-8859-1"),"UTF-8");
		//System.err.println(result);
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的 URL
	 * @param param
	 *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
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
}