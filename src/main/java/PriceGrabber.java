

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PriceGrabber {
	
	private Long price = (long) 0;
	private static String lastUpdated = "";
	
	public ArrayList<ArrayList<String>> getPrices() throws JSONException, IOException
	{
		ArrayList<ArrayList<String>> prices = new ArrayList<ArrayList<String>>();
		JSONObject json = readJsonFromUrl();
		ArrayList<String> timestamp = new ArrayList<String>();
		
		timestamp.add(lastUpdated);
		
		prices.add(timestamp);
		prices.add(getEMPWarriorCape(json));
		prices.add(getEMPMageCape(json));
		prices.add(getEMPBowmanCape(json));
		prices.add(getEMPThiefCape(json));
		prices.add(getEMPPirateCape(json));
		
		prices.add(getEMPWarriorHelm(json));
		prices.add(getEMPMageHelm(json));
		prices.add(getEMPBowmanHelm(json));
		prices.add(getEMPThiefHelm(json));
		prices.add(getEMPPirateHelm(json));
		
		prices.add(getEMPWarriorSuit(json));
		prices.add(getEMPMageSuit(json));
		prices.add(getEMPBowmanSuit(json));
		prices.add(getEMPThiefSuit(json));
		prices.add(getEMPPirateSuit(json));
		
		prices.add(getEMPWarriorGloves(json));
		prices.add(getEMPMageGloves(json));
		prices.add(getEMPBowmanGloves(json));
		prices.add(getEMPThiefGloves(json));
		prices.add(getEMPPirateGloves(json));
		
		prices.add(getEMPWarriorShoes(json));
		prices.add(getEMPMageShoes(json));
		prices.add(getEMPBowmanShoes(json));
		prices.add(getEMPThiefShoes(json));
		prices.add(getEMPPirateShoes(json));
		
		prices.add(getEMPWarriorShoulder(json));
		prices.add(getEMPMageShoulder(json));
		prices.add(getEMPBowmanShoulder(json));
		prices.add(getEMPThiefShoulder(json));
		prices.add(getEMPPirateShoulder(json));
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorCape(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1102275"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageCape(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1102276"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanCape(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1102277"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefCape(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1102278"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateCape(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1102279"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorHelm(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1003172"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageHelm(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1003173"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanHelm(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1003174"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefHelm(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1003175"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateHelm(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1003176"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorSuit(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1052314"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageSuit(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1052315"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanSuit(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1052316"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefSuit(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1052317"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateSuit(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1052318"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorGloves(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1082295"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageGloves(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1082296"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanGloves(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1082297"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefGloves(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1082298"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateGloves(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1082299"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorShoes(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1072485"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageShoes(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1072486"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanShoes(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1072487"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefShoes(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1072488"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateShoes(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1072489"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPWarriorShoulder(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1152108"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPMageShoulder(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1152110"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPBowmanShoulder(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1152111"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPThiefShoulder(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1152112"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	public ArrayList<String> getEMPPirateShoulder(JSONObject json) throws JSONException, IOException
	{
		ArrayList<String> prices = new ArrayList<String>();
		JSONArray jarray = json.getJSONArray("fm_items");
		String str = "";
		JSONObject json2 = new JSONObject(json);
		
		for (int i = 0; i < jarray.length(); i++)
		{
			json2 = jarray.getJSONObject(i);
			str = json2.getString("U");
			if (str.equals("1152113"))
			{
				price = Long.parseLong(json2.getString("c"));
				str = NumberFormat.getNumberInstance(Locale.US).format(price);
				prices.add(str);
		    }
		}
		
		return prices;
	}
	
	
	
	private static String readAll(Reader rd) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		int cp;
		
		while ((cp = rd.read()) != -1)
		{
			sb.append((char) cp);
		}
		
		return sb.toString();
	}
	
	public static JSONObject readJsonFromUrl() throws IOException, JSONException
	{
		URL link = new URL("http://maple.fm/api/search?server=0");
		URLConnection conn = link.openConnection();
		conn.setRequestProperty("User-Agent", "Mozilla/5.0");
		conn.connect();
		InputStream is = conn.getInputStream();
		
	    try 
	    {
	        BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	        String jsonText = readAll(rd);
	        JSONArray jarray = new JSONArray(jsonText);
	        String str = jarray.getJSONObject(0).toString();
	        lastUpdated = jarray.getJSONObject(1).toString();
	        JSONObject json = new JSONObject(str);
	        
	        return json;
	     } 
	    finally 
	    {
	        is.close();
	    }
		
	}

}
