package constant;
public class Constant2 {
public static final int PROCESSOR;
static {
PROCESSOR = Runtime.getRuntime().availableProcessors();
}
}
