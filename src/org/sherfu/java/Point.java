/**
 * 
 */
package org.sherfu.java;

/**
 * @author Admin
 *
 */
public class Point {

	/**
	 * 
	 */
	private int x;
	private int y;
	/**
	 * @return the x
	 */
	public Point()
	{

	}
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
}
