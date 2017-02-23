public class CPU extends Main {
	
	static byte[] CPUMem = new byte[0x10000];
	static int programCounter;
	static int stack;
	static int accumulator;
	static int xreg;
	static int yreg;
	static int processorStatus;
	static int carryFlag;
	static int zeroFlag;
	static int interruptDisable;
	static int decimalModeFlag;
	static int breakCommand;
	static int overflowFlag;
	static int negativeFlag;

}