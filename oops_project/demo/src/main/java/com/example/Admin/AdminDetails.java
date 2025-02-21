import com.example.Database.AdminData;
public class AdminDetails {
    AdminData adminData = new AdminData();
    public boolean login(String Username,String Password){
            if(adminData.validateAdminLogin(Username, Password)){
                return true;
            }
            return false;
    }
    public void addDestination(String destination){
        
    }

}
