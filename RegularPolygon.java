
public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	RegularPolygon(){
		n = 3;
		side = 1.0;
		x = 0;
		y = 0;
	}
	/**
	 * @param newN    边的个数
	 * @param newSide 边长
	 * */
	RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
		x = 0;
		y = 0;
	}
	/**
	 * @param newN        边的个数
	 * @param newSide     边长
	 * @param newCenterX  中心坐标X
	 * @param newCenterY  中心坐标Y
	 * */
	RegularPolygon(int newN, double newSide, double newCenterX, double newCenterY){
		n = newN;
		side = newSide;
		x = newCenterX;
		y = newCenterY; 
	}
	
	public void setN(int newN){
		n = newN;
	}
	public int getN(){
		return n;
	}
	
	public void setSide(double newSide){
		side = newSide;
	}
	public double getSide(){
		return side;
	}
	public void setCenerX(double newX){
		x = newX;
	}
	public double getCenerX(){
		return x;
	}
	public void setCenerY(double newY){
		y = newY;
	}
	public double getCenerY(){
		return y;
	}
	public double getPerimeter(){
		return n*side;
	}
	public double getArea(){
		double area;
		area = (n * Math.pow(side, 2)) / (4 * Math.tan((Math.PI / n)));
		return area;
	}
}
