public class TheFactory {

    interface PlainCake {
        String getType();
    }

    static class ChoclateCake implements PlainCake {
        @Override
        public String getType() {
            return "I love choclate!";
        }
    }

    static class VanillaCake implements PlainCake {
        @Override
        public String getType() {
            return "I love vanilla!";
        }

    }
    static class CheeseCake implements PlainCake {
        @Override
        public String getType() {
            return "I love cheese!";
        }
    }

    static class CakeFactory {
        public PlainCake getPlainCake(String order) {

            order = order.toLowerCase();

            PlainCake plaincakeType = null;

            switch(order) {
                case "choclate":
                    plaincakeType = new ChoclateCake();
                    break;
                case "vanilla":
                    plaincakeType = new VanillaCake();
                    break;
                case "cheese":
                    plaincakeType = new CheeseCake();
                    break;
                default:
                    throw new IllegalArgumentException("Wrong Order!");
            }

            return plaincakeType;
        }
    }

    public static void main(String[] args) {
        CakeFactory myCakeFactory = new CakeFactory();
        PlainCake myChoclateCake = myCakeFactory.getPlainCake("choclate");
        PlainCake myVanillaCake = myCakeFactory.getPlainCake("vanilla");
        PlainCake myCheeseCake = myCakeFactory.getPlainCake("cheese");

        System.out.println(myChoclateCake.getType());
        System.out.println(myVanillaCake.getType());
        System.out.println(myCheeseCake.getType());
    }

}