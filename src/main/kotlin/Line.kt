class Line(p1: Point = Point (0.0, 0.0), p2: Point = Point (1.0, 0.0)) {
    var p1: Point = Point(0.0, 0.0)
        set (value){
            if (value.isEqual(p2)){
                field = p1
            } else {
                field = value
            }
        }
    var p2: Point = Point(1.0, 0.0)
        set (value){
            if (value.isEqual(p1)){
                field = p2
            } else {
                field = value
            }
        }

    init {
        this.p1 = p1
        this.p2 = p2
    }

    fun getSlope(): Double{
        return ((p2.y - p1.y) / (p2.x/p1.x))
    }
}