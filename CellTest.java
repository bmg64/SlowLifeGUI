import static org.junit.Assert.*;

import org.junit.Test;


public class CellTest {

	/**
	 * Pinning test that checks if the variable _maxSize is affected by toString.
	 */
	@Test
	public void toString_maxSizeTest() {
		Cell testCell = new Cell();
		int init_maxSize = testCell._maxSize;
		testCell.toString();
		assertEquals(init_maxSize, testCell._maxSize);
	}

	/**
	 * Pinning test that checks whether the return value is equal to "X" and "." for both a living 
	 * and a dead Cell.
	 */
	@Test
	public void toStringInputTest() {
		Cell livingCell = new Cell(true);
		Cell deadCell = new Cell(false);
		assertEquals(livingCell.toString(), "X");
		assertEquals(livingCell.toString(), ".");
		assertEquals(deadCell.toString(), "X");
		assertEquals(deadCell.toString(), ".");
	}
	
	/**
	 * Pinning test that checks whether the return value is equal to "X" and "." for a cell not
	 * initialized with a value for alive.
	 */
	@Test
	public void toStringNoArgCellTest() {
		Cell noArgCell = new Cell();
		assertEquals(noArgCell.toString(), "X");
		assertEquals(noArgCell.toString(), ".");
	}
}
