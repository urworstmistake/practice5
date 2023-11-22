open class Line(): Point() {
    var point1: Point = Point()
    var point2: Point = Point()

    //Вторичный конструктор класса Line
    constructor(_point1: Point, _point2: Point): this(){
        point1 = _point1
        point2 = _point2
    }

    //Переопределение абстрактного метода info
    override fun info(){
        println("Прямая с координатами ${Pair(point1.x,point1.y)}, ${Pair(point2.x,point2.y)}")
    }
}