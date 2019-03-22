package enri.daos;

import enri.db.MyConnection;
import enri.dtos.RegistrationDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDAO implements Serializable {

//    public void closeConnection() {
//        try {
//            if (rs != null)
//                rs.close();
//            if (ps != null)
//                ps.close();
//            if (conn != null) 
//                conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public RegistrationDAO() {
    }

    public String checkLogin(String username, String password) {
        String role = "failed";
        String sql = "Select Role From Registration Where Username = ? AND Password = ?";
        try (Connection conn = MyConnection.openConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = null;
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(role);
        return role;
    }

    public List<RegistrationDTO> findByLikeName(String search) {
        List<RegistrationDTO> result = null;
        ResultSet rs = null;
        String username = null;
        String role = null;
        String fullname = null;
        RegistrationDTO dto = null;
        String query = "Select Username, Role, Fullname From Registration Where Fullname LIKE ?";
        try (Connection conn = MyConnection.openConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                username = rs.getString("Username");
                role = rs.getString("Role");
                fullname = rs.getString("Fullname");
                dto = new RegistrationDTO(username, role, fullname);
                result.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(String username) {
        boolean check = false;
        String query = "Delete From Registration Where Username = ?";
        try (Connection conn = MyConnection.openConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, username);
            check = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
