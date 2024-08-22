import java.io.*;
class Employee
{
    int empId;
    String name,contact_no,email_id,designation;
    float salary;
    void getData()throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
    
        System.out.print("Enter the Employee id:  ");
        empId=Integer.parseInt(d.readLine());
        
        System.out.print("Enter the Employee name:  ");
        name=d.readLine();
        
        System.out.print("Enter the Salary:  ");
        salary=Float.valueOf(d.readLine());
        
        System.out.print("Enter the Designation:  ");
        designation=d.readLine();
        
        System.out.print("Enter the Email-id:  ");
        email_id=d.readLine();
        
        System.out.print("Enter the Contact:  ");
        contact_no=d.readLine();
        
        System.out.println("*****************************************");
    }
    void search(Employee e[],int n,int ei)
    {
        int i,flag=0;
        
       for(i=0;i<n;i++)
        {
            if(ei==e[i].empId)
            {
                flag=1;
                break;  
            }
        }
        if(flag==1)
        {
            System.out.println("********************************");
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
            System.out.println("Email ID: "+email_id);
            System.out.println("Contact No: "+contact_no);
            System.out.println("********************************");
        }
        else
            System.out.println("Employee is not found.");
    }
    void update(Employee e[],int n)throws IOException
    {
        int eId,flag=0;
        float sal;
        String designation1;
        DataInputStream d = new DataInputStream(System.in);

        System.out.println("Enter Employee ID you want to update: ");
        eId=Integer.parseInt(d.readLine());

        System.out.println("<<<What You Want to update??>>> ");
        System.out.println("1.EMPLOYEE'S SALAR\n2.EMPLOYEE'S DESIGNATION");
        int N = Integer.parseInt(d.readLine());

        if(N==1)
        {   
            System.out.println("Enter the salary you want to update: ");
            sal=Float.valueOf(d.readLine());
            for(int i=0;i<n;i++)
            {
                if(eId==e[i].empId)
                {
                    e[i].salary=sal;
                    flag=1;
                }
            }

        }
        else
        {
            System.out.println("Enter the designation you want to update: ");
            designation1=d.readLine();

            for(int i=0;i<n;i++)
            {
                if(eId==e[i].empId)
                {
                    e[i].designation=designation1;
                    flag=1;
                }
            }
        }
        if(flag==1)
            System.out.println("Information updated.......");
        else
            System.out.println("Information not updated......");
    }       
    void display()
    {
        System.out.println(empId+"          "+name+"          "+salary+"          "+designation+"          "+email_id+"          "+contact_no+"\n");

    }
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        Employee e[];
        int n=0;
        int i,ch;
        
        System.out.println("Enter number records to create:");
        n=Integer.parseInt(d.readLine());
    
        e=new Employee[n];
        for(i=0;i<n;i++)
        e[i]=new Employee();

        while(true)
        {
            System.out.println("*****<<<<<MENU>>>>>*****");
            System.out.println("1 : ACCEPT THE EMPLOYEE INFORMATIOON");
            System.out.println("2 : DISPLAY THE EMPLOYEE INFORMATION");
            System.out.println("3 : SEARCH THE EMPLOYEE INFORMATION");
            System.out.println("4 : UPDATE THE EMPLOYEE INFORMATION");
            System.out.println("5 : EXIT");
            System.out.println("Enter your choice: ");
            ch=Integer.parseInt(d.readLine())
   switch(ch)
            {   case 1:for(i=0;i<n;i++)
                    e[i].getData();
                    break;

               case2:System.out.println("Empl_id          Name         Salary          Designation          Email_id         Contact_No\n");
                    for(i=0;i<n;i++)
                    e[i].display();
                    break;
                
                case 3:System.out.println("Enter Employee id to search:");
                    int ei=Integer.parseInt(d.readLine());
                    e[0].search(e,n,ei);
                    break;

                case 4:System.out.println("<<<<UPDATE THE DATA>>>>");
                    e[0].update(e,n);
                    break;

                case 5:System.exit(0);

            }
        }
        
    }
}

