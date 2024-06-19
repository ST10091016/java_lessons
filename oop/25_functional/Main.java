public class Main {
	public static void main(String[] args){
       
       Supplier<String> stringSupplier = () -> "I am a supplier";
       Supplier<Integer> integerSupplier = () -> 100;
       System.out.println(stringSupplier.get());
       System.out.println(integerSupplier.get());

       IntSupplier<Integer> inPrimitiveSupplier = () -> 47;
       System.out.println(inPrimitiveSupplier.get());

       Consumer<String> stringConsumer = (s) -> System.out.println(s);
       stringConsumer.accept("I am a consumer");

       Consumer<Integer> integerConsumer = (s) -> System.out.println(s);
       integerConsumer.accept(35);

       IntConsumer<Integer> integerConsumer2 = (s) -> System.out.println(s);
       integerConsumer2.accept(94);

       Predicate<String> stringColorTester = (s) -> (s.equals("blue"));
       System.out.println(stringColorTester.test("brown"));

       Function<String, Integer> lengthFinderFunction =(s) -> s.length();
       Integer apply = lengthFinderFunction.apply("FunctionLength");
       System.out.println(apply);

	}
}