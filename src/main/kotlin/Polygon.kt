class Polygon(vararg _points: Point): Line() {
    var points: Array<Point>
    init {
        points = _points as Array<Point>
    }

    //Метод moveOx для движения по оси ox
    fun moveOx(dx: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
        }
    }
    //Метод moveOx для движения по оси oy
    fun moveOy(dy: Double){
        for (i in points){
            i.y = i.y?.plus(dy)
        }
    }
    //Метод moveOx для движения по осям ox,oy
    fun move(dx: Double, dy: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
            i.y = i.y?.plus(dy)
        }
    }

    //Переопределение абстрактного метода info
    override fun info() {
        println("Многоугольник с координатами: ")
        for (i in points){
            print("(${i.x},${i.y}) ")
        }
    }
}