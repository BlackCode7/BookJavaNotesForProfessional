package Section71ArgumentProcessingUsingGWTToolBase;

import java.io.File;

import numericPrimitiveJava.manipulandoArquivos.ArgHandlerDir;
import numericPrimitiveJava.manipulandoArquivos.ArgHandlerInt;

public class ToolBase {	
	
	protected File dir;
	protected int port;
	
	public File getDir() {
		return dir;
	}
	public void setDir(File dir) {
		this.dir = dir;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ToolBase(File dir, int port) {
		super();
		this.dir = dir;
		this.port = port;
	}
	
	public void MyProgramHandler() {
		this.registerHandler(new ArgHandlerDir() {
		private File dir;

		@Override
		public void setDir(File dir) {
			this.dir = dir;
		}
	});
	this.registerHandler(new ArgHandlerInt() {
		private int port;
		
		@Override
		public String[] getTagArgs() {
			return new String[]{"port"};
		}
		@Override //
		public void setInt(int value) {
			this.port = value;
		}
	});
	}
	
	private void registerHandler(ArgHandlerDir argHandlerDir) {
	}
	private void registerHandler(ArgHandlerInt argHandlerInt) {		
	}
	
	public static void main(String[] args) {
		
		MyProgramHandler myShell = new MyProgramHandler();		
			/*if (myShell.processArgs(args)) {
				System.out.println(String.format("port: %d; dir: %s",
				myShell.getPort(), myShell.getDir()));
			}*/
			System.exit(1);
		}
}
