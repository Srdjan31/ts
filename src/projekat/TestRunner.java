package projekat;

import java.util.logging.Logger;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String [] args) {
		Result res = JUnitCore.runClasses(Tests.class);
		
		Logger l = Logger.getLogger(TestRunner.class.toString());
		
		for(Failure r : res.getFailures())
		{
			l.warning(r.toString());
		}

		l.info("Broj izvrsenih testova: " + res.getRunCount());
		l.info("Vreme izvrsenih tesova: " + res.getRunTime());
		l.info("Broj preskocenih testova:" + res.getIgnoreCount());
		l.info("Broj uspesno izvrsenih testova: " + (res.getRunCount() - res.getIgnoreCount()
		- res.getFailureCount() - res.getFailureCount()));
		l.info("Broj neuspesnih testova:" + res.getFailureCount());
		l.info("Broj dinamicki preskocenih testova:" + res.getFailureCount());
		
		
		if (res.wasSuccessful()) {
			l.info("Svi testovi uspesno izvrseni!");
		} else {
			l.warning("Neki testovi imaju greske!");
		}
		
	}
}
