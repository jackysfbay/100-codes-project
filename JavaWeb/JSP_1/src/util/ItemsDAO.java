package util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import util.DBHelper;

public class ItemsDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	public ArrayList<Items> getAllItems() throws Exception {

		conn = DBHelper.getConnection();
		String sql = "select * from items";
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		ArrayList<Items> list = new ArrayList<Items>();
		while (rs.next()) {
			Items item = new Items();
			item.setId(rs.getInt("id"));
			item.setName(rs.getString("name"));
			item.setCity(rs.getString("city"));
			item.setNumber(rs.getInt("number"));
			item.setPrice(rs.getInt("price"));
			item.setPicture(rs.getString("picture"));
			list.add(item);
		}
		if (rs != null) {
			stmt.close();
			stmt = null;
		}
		return list;
	}

	// getItemsById
	public Items getItemsById(int id) throws Exception {
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from items where id =?;";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Items item = new Items();
				item.setId(rs.getInt("id"));
				item.setName(rs.getString("name"));
				item.setCity(rs.getString("city"));
				item.setNumber(rs.getInt("number"));
				item.setPrice(rs.getInt("price"));
				item.setPicture(rs.getString("picture"));
				return item;
			} else {
				return null;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		}
	}

	public ArrayList<Items> getViewList(String list) throws Exception {//get list which from cookies items
		
		System.out.println("list:"+list);
		ArrayList<Items> itemlist = new ArrayList<Items>();
		
		int iCount=5;  //return the last 5 items
		if(list!=null&&list.length()>0)
		{
		    String[] arr = list.split(",");
//		    System.out.println("arr.length="+arr.length);
		    if(arr.length>=5)
		    {
		       for(int i=arr.length-1;i>=arr.length-iCount;i--)
		       {
		    	   int id = Integer.parseInt(arr[i]);
		    	   
		    	  itemlist.add(getItemsById(id));  
		       }
		    }
		    else
		    {
		    	for(int i=arr.length-1;i>=0;i--)
		    	{
		    		itemlist.add(getItemsById(Integer.parseInt(arr[i])));
		    	}
		    }
		    return itemlist;
		}
		else
		{
			return null;
		}
	}

	// public static void main(String[] args) throws Exception{
	// ItemsDAO dao = new ItemsDAO();
	// Items item = dao.getItemsById(12);
	// System.out.println(item.getName());
	// }
}
