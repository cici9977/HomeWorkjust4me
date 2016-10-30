class PointType
{
int x ;
int y ;
public String talk()
{
return "The x of the cicle is "+ this.x + "The y of the circle is "+this.y;
}
}


class CircleType extends PointType
{
	double radius ;
	double area;
	public CircleType(int x,int area,double radius)
	{
	// 分别为属性赋值
	this.x = x ;
	this.area = radius * radius * 3.14 ;
	this.radius = radius *2 * 3.14;
	}
	// 此处复写 Person 中的 talk()方法
	public String talk()
	{
	return "The area of the circle is "+this.radius +"The circumference of the circle is "+this.area;
	}
	}


	class TestOverDemo1
	{
	public static void main(String[] args)
	{
	CircleType s = new CircleType(5,5,10) ;
	// 此时调用的是子类中的 talk()方法
	System.out.println(s.talk()) ;
	}
	}
