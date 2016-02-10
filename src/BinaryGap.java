/**
 * Created by mmn on 05-02-2016.
 */
public class BinaryGap {

    public static int findBinaryGap(final String stringBinary) {
	int gapMaior = 0;
	int gapContador = -1;
	int getBitDaDireitaParaEsquerda = 0;

	int intBinaryValue = Integer.parseInt(stringBinary, 2);

	while (intBinaryValue > 0) {

	    getBitDaDireitaParaEsquerda = intBinaryValue & 1;
	    intBinaryValue = intBinaryValue >> 1;

	    if (getBitDaDireitaParaEsquerda == 0 && gapContador >= 0) {
		gapContador++;
	    }

	    if (getBitDaDireitaParaEsquerda == 1) {
		gapMaior = gapContador > gapMaior ? gapContador : gapMaior;
		gapContador = 0;
	    }
	}

	return gapMaior;
    }
}

