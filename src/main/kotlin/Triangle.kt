class Triangle(p1: Point = Point(0.0, 0.0), p2: Point = Point(1.0, 0.0), p3: Point = Point(0.0, 1.1)) {
    var p1: Point = Point(0.0, 0.0)
        set (value){
            if (value.isEqual(p2)){
                field = p1
            } else {
                field = value
            }
        }
    var p2: Point = Point(1.0, 0.0)
        set (value) {
            if (value.isEqual(p1)) {
                field = p2
            } else {
                field = value
            }
        }
    var p3: Point = Point(0.0, 0.0)
        set (value){
            if (value.isEqual(p2)){
                field = p1
            } else {
                field = value
            }
        }


    fun getArea(): Double{
        return (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y))
    }


}
