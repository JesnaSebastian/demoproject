package apiPojo;

public class login_Pojo {
    private String Email;
    private String password;

    public String getEmail()
    {
        return Email;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }

    public void setEmail(String Email) {
        this.Email=Email;
    }
}

