class ColoredLine(): Line() {
    var line: Line = Line()
    var color: Color? = null

    //Вторичный конструктор класса ColoredLine
    constructor(_point1: Point, _point2: Point, _color: Color): this(){
        line = Line(point1, point2)
        color = _color
    }

    //Переопределение абстрактного метода info
    override fun info() {
        println("${super.info()}, имеет цвет $color")
    }
}