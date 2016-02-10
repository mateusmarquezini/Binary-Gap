import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mateus.marquezini on 10-02-2016.
 */
public class CenariosTestes {
    private BinaryGap gap;

    @Before
    public void setUp() {
	gap = new BinaryGap();
    }

    @Test
    public void testar_esperando_um_gap_de_tres() {
	Assert.assertEquals(3, gap.findBinaryGap("10001"));
    }

    @Test
    public void testar_esperando_um_gap_de_dois() {
	Assert.assertEquals(2, gap.findBinaryGap("1001"));
    }

    @Test
    public void testar_esperando_um_gap_de_zero() {
	Assert.assertEquals(0, gap.findBinaryGap("0001"));
    }

    @Test
    public void testar_esperando_um_gap_de_um() {
	Assert.assertEquals(1, gap.findBinaryGap("101"));
    }
}

