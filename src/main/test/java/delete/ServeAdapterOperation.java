package delete;

import com.cmbsj.monitor.service.ServerService;
import com.cmbsj.monitor.util.SerConTarget;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lsy on 2017/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/application-context.xml" })
public class ServeAdapterOperation {
    @Autowired
    SerConTarget serConAdapter;

    @Test
    public void getDateFromNeo(){
        serConAdapter.getAllSerFromNeo();
    }

}
