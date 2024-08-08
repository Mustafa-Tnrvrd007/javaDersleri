//package java102.P_1_MaceraOyunu.Location;
//
//import java102.P_1_MaceraOyunu.Awards;
//import java102.P_1_MaceraOyunu.Characters.Snake;
//import java102.P_1_MaceraOyunu.Player;
//
//public class Mine extends BattleLocation{
//    // Awards nullAward = ;
//    private Snake[] snakeList ; /// canavar sayisi listenin boyutunu belirledi
//    public Snake snake ;
//    public int snakeNummber ;
//    Mine(Player player ,String locationName){
//
//        super(player, locationName, new Awards("Null",false), new Snake());
//        snake = new Snake();
//        super.setObstacle(snake); ////////////////
//        snakeNummber = snake.getObsNumber()+3;
//        snake.setObsNumber(snakeNummber);
//        snakeList = new Snake[snake.getObsNumber()];
//        snakeListImplement(); ////
//        super.listObstacle = getSnakeList();
//
//
//    }
//
//    @Override
//    public boolean onLocation() {
//
//        return super.onLocation();
//    }
//
//    @Override
//    public void lootTaking() {
//        /// % 15 silah
//        /// % 15 zirh
//        /// % 25 para
//    }
//
//    public void setSnakeList(Snake[] snakeList){
//        this.snakeList=snakeList;
//    }
//
//    public void snakeListImplement(){
//        for (int i = 0; i < this.snakeList.length; i++) {
//            this.snakeList[i] = new Snake(); // liste elemanını snake nesnesi attım
//            this.snakeList[i].snakeDamage(); // bu nesnenin damage değişkenini belirledim
//        }
//    }
//    public Snake[] getSnakeList(){
//        return this.snakeList;
//    }
//
//
//}
