package umich.msfragger.params.fragger;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnzymeProviderTest {
  private static final Logger log = LoggerFactory.getLogger(EnzymeProviderTest.class);

  @Test
  public void get() {
    List<MsfraggerEnzyme> enzymes = new EnzymeProvider().get();
    log.info("Parsed enzymes: {}", enzymes);
    assertFalse("No enzymes parsed", enzymes.isEmpty());
  }
}