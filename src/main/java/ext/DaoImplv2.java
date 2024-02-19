package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double t = 77;
        return t;
    }

}
