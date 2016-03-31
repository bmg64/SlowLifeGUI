import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;


public class MainPanelTest {

	/**
	 * Pinning test that checks whether the input value and output value are equal for various inputs.
	 */
	@Test
	public void convertToIntInputTest() {
		int inputVal = 0;
		int returnVal = MainPanel.convertToInt(inputVal);
		assertEquals(inputVal, returnVal);
		inputVal = 1000;
		returnVal = MainPanel.convertToInt(inputVal);
		assertEquals(inputVal, returnVal);
		inputVal = Integer.MAX_VALUE;
		returnVal = MainPanel.convertToInt(inputVal);
		assertEquals(inputVal, returnVal);	
	}
	
	/**
	 * Pinning test that checks if the variables _r and _running are affected by convertToInt.
	 */
	@Test
	public void convertToInt_r_runningTest() {
		MainPanel main = (MainPanel) new JPanel();
		int init_r = MainPanel._r;
		boolean init_running = main._running;
		MainPanel.convertToInt(0);
		assertEquals(init_r, MainPanel._r);
		assertEquals(init_running, main._running);
	}
	
	/**
	 * Pinning test that checks if the variables _size and _maxCount are affected by convertToInt.
	 */
	@Test
	public void convertToInt_size_maxCountTest() {
		MainPanel main = (MainPanel) new JPanel();
		int init_size = main._size;
		int init_maxCount = main._maxCount;
		MainPanel.convertToInt(0);
		assertEquals(init_size, main._size);
		assertEquals(init_maxCount, main._maxCount);
	}
	
	/**
	 * Pinning test that checks if the _running variable is changed after runContinuous runs.
	 */
	@Test
	public void runContinuous_runningTest() {
		MainPanel main = (MainPanel) new JPanel();
		boolean init_running = main._running;
		main.runContinuous();
		assertEquals(init_running, main._running);
	}
	
	/**
	 * Pinning test that checks if the _r variable is changed after runContinuous runs.
	 */
	@Test
	public void runContinuous_rTest() {
		MainPanel main = (MainPanel) new JPanel();
		int init_r = MainPanel._r;
		main.runContinuous();
		assertEquals(init_r, MainPanel._r);
	}
	
	/**
	 * Pinning test that checks whether multiple iterations of runContinuous changes _maxCount.
	 */
	@Test
	public void runContinuous_maxCountTest() {
		MainPanel main = (MainPanel) new JPanel();
		int init_maxCount = main._maxCount;
		for(int i = 0; i < 10; i++){
			main.runContinuous();
		}
		assertEquals(init_maxCount, main._maxCount);
	}

}
