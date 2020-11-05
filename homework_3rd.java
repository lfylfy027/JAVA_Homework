package helloworld;

import java.sql.Date;

import java.util.ArrayList;

public class homework_3rd {
		//课后题9-3
		public static void homework_9_3() {
			Date date=new Date(0);
			for(int n=4;n<12;n++) {
			date.setTime((long)Math.pow(10, n));
			System.out.println("流逝时间为"+(long)Math.pow(10, n)+"的日期为"+date.toString());
			}
		}
		
		
		//课后题13-3
		public static void homework_13_3(ArrayList<Number> list) {
			int len=list.size();
			quicksort(list, 0, len-1);
		}
		//采用快速排序
		public static void quicksort(ArrayList<Number> list,int begin,int end) {
			if(begin<end) {
				//随机选取基准数
				int index=begin+(int)((end-begin)*Math.random());
				swap(list, end, index);
				int i=begin-1;
				//将比基准数小的数置于前，比基准数大的数置后
				for(int j=begin;j<=end;j++) {
					if(list.get(j).doubleValue()<=list.get(end).doubleValue()) {
						i++;
						swap(list, i, j);
					}
				}
				//分治比基准数小和大的数的集合
				quicksort(list, begin, i-1);
				quicksort(list, i+1, end);
			}
		}
		//交互数组中两元素
		public static void swap(ArrayList<Number> list,int left,int right) {
			Number tmp=list.get(right);
			list.set(right, list.get(left));
			list.set(left,tmp);
		}
		
		public static void main(String args[]) {
			ArrayList<Number> list =new ArrayList<Number>();
			list.add(5);
			list.add(1.1);
			list.add(0.5);
			list.add(3.8);
			list.add(-59595);
			System.out.println(list.toString());
			homework_13_3(list);
			System.out.println(list.toString());
		}
}

//课后题9-7
class Account{
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	public Account() {}
	public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	public int getid() {
		return id;
	}
	public double getbalance(){
		return balance;
	}
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public void setannualInterestRate(double annual) {
		annualInterestRate=annual;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public boolean withDraw(double count) {
		if(balance<count)return false;
		balance-=count;
		return true;
	}
	public void deposit(double count) {
		balance+=count;
	}
}

//课后题13-13
class Course implements Cloneable
{
    private String courseName;
    private String[] students = new String[100];
    private int numberofstudents;


    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudents(String student)
    {
    	students[numberofstudents]=student;
    	numberofstudents++;
    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberofstudents;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void dropStudents(String student)
    {
    }

    public Object clone()
    {
        Course newCourse = new Course(getCourseName());
        System.arraycopy(students, 0, newCourse.students, 0, students.length);
        newCourse.numberofstudents=numberofstudents;
        return newCourse;
    }
}