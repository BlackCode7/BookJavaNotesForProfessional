package numericPrimitiveJava.manipulandoArquivos;

import java.io.File;

public class ManipulandoArquivos {

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

	public ManipulandoArquivos() {
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
		@Override
		public void setInt(int value) {
		this.port = value;
		}
		});
		}

	private void registerHandler(ArgHandlerInt argHandlerInt) {
		// TODO Auto-generated method stub
		
	}

	private void registerHandler(ArgHandlerDir argHandlerDir) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		MyProgramHandler myShell = new MyProgramHandler();
		if (myShell.processArgs(args)) {
			// main program operation
			System.out.println(String.format("port: %d; dir: %s", myShell.getPort(), myShell.getDir()));
		}
		System.exit(1);
	}

}
