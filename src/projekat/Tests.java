package projekat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({RegistracijaTest.class, PrijavaTest.class, ProveraInformacijaTest.class,InformacijeTest.class, 
DodavanjeTriProizvodaTest.class, UkupnaCenaTest.class, PerformanseTest.class })
	public class Tests {
}
