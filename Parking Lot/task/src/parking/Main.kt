package parking

fun main() {
    val spot = mutableMapOf<Int, MutableList<String>>()
    var flag: Boolean = true
    var spotCreated: Boolean = false
    var spotsCount = 0


    while (flag) {
        var input = readln().toString()
        var spotsNumber: Int = 0
        val split = input.split("\\s+".toRegex())

        if (split[0] == "create") {
            spotCreated = true
            spotsNumber = split[1].toInt()
            spot.clear()
            spotsCount = 0
            for (i in 1..spotsNumber) {
                spot.put(i, emptyList<String>().toMutableList())
            }
            println("Created a parking lot with $spotsNumber spots.")
        }

        if (!spotCreated && split[0] != "exit") {
            println("Sorry, a parking lot has not been created.")
        }

        if (split[0] == "exit") {
            flag = false
            break
        }
        if (spotCreated) {

            if (split[0] == "exit") {
                flag = false
                break
            }
            if (split[0] == "park") {

                val car = mutableListOf<String>()
                car.add(split[1].uppercase())
                car.add(split[2].uppercase())

                for ((k, v) in spot) {
                    if (spot[k] == emptyList<String>()) {
                        spot.put(k, car)
                        println("${car[1]} car parked in spot $k.")
                        break
                    }
                    if (k == spot.size && spot[k] != emptyList<String>().toMutableList()) {
                        println("Sorry, the parking lot is full.")
                    }
                }
            }

            if (split[0] == "leave") {
                if (spot[split[1].toInt()] == emptyList<String>()) {

                    println("There is no car in spot ${split[1]}.")
                }

                if (spot[split[1].toInt()] != emptyList<String>().toMutableList()) {
                    spot[split[1].toInt()] = emptyList<String>().toMutableList()
                    println("Spot ${split[1]} is free.")
                }

            }

            if (split[0] == "status") {
                for ((k, v) in spot) {
                    if (spot[k] == emptyList<String>().toMutableList()) {
                        spotsCount++

                        if (spotsCount == spot.size) {
                            println("Parking lot is empty.")

                        }
                    }
                    if (spot[k] != emptyList<String>()) {

                        println("${v[0]} ${v[1]}")
                    }
                }


            }

            if (split[0] == "reg_by_color") {
                spotsCount = 0
                var index = 0
                var i =0
                for ((k, v) in spot) {
                    i++
                    if (!spot[k]?.contains(split[1].uppercase())!!) {
                        spotsCount++

                        if (spotsCount == spot.size) {
                            println("No cars with color ${split[1].uppercase()} were found.")
                            spotsCount = 0
                            break
                        }
                        if (spotsCount != spot.size&&i == spot.size) {
                            println("")
                            spotsCount = 0

                        }
                    }
                    if (spot[k]?.contains(split[1].uppercase())!!) {
                        if (i == spot.size) {
                            println(", ${v[0]}")
                            spotsCount = 0

                        }

                        if (index > 0&&i != spot.size) {
                            print(", ${v[0]}")

                        }
                        if (index == 0) {
                            print("${v[0]}")
                            index++
                        }


                    }
                }


            }

            if (split[0] == "spot_by_color") {
                spotsCount = 0
                var index = 0
                var i =0
                for ((k, v) in spot) {
                    i++
                    if (!spot[k]?.contains(split[1].uppercase())!!) {
                        spotsCount++

                        if (spotsCount == spot.size) {
                            println("No cars with color ${split[1].uppercase()} were found.")
                            spotsCount = 0
                            break
                        }
                        if (spotsCount != spot.size&&i == spot.size) {
                            println("")
                            spotsCount = 0

                        }
                    }
                    if (spot[k]?.contains(split[1].uppercase())!!) {
                        if (i == spot.size) {
                            println(", $k")
                            spotsCount = 0

                        }

                        if (index > 0&&i != spot.size) {
                            print(", $k")

                        }
                        if (index == 0) {
                            print("$k")
                            index++
                        }


                    }
                }


            }

            if (split[0] == "spot_by_reg") {
                spotsCount = 0
                var index = 0
                var i =0
                for ((k, v) in spot) {
                    i++
                    if (!spot[k]?.contains(split[1].uppercase())!!) {
                        spotsCount++

                        if (spotsCount == spot.size) {
                            println("No cars with registration number ${split[1].uppercase()} were found.")
                            spotsCount = 0
                            break
                        }
                        if (spotsCount != spot.size&&i == spot.size) {
                            println("")
                            spotsCount = 0

                        }
                    }
                    if (spot[k]?.contains(split[1].uppercase())!!) {
                        if (i == spot.size) {
                            println(", $k")
                            spotsCount = 0

                        }

                        if (index > 0&&i != spot.size) {
                            print(", $k")

                        }
                        if (index == 0) {
                            print("$k")
                            index++
                        }


                    }
                }


            }
        }
    }
}