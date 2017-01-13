(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
  (if x
    true
    false))

(defn teen?
  [x]
  (>= 19 x 13))


(defn abs
  [x]
  (if (neg? x)
    (- x)
    x))

(defn divides?
  [divisor n]
  (= (mod n divisor) 0))


(defn fizzbuzz
  [x]
  (cond
    (divides? 15 x) "gotcha!"
    (divides? 3 x) "fizz"
    (divides? 5 x) "buzz"
    :else ""))


(defn fizzbuzz2
  [x]
  (condp  divides? x
    15  "gotcha"
    3 "fizz"
    5 "buzz"
    ""))


(defn teen?
  [x]
  (>= 19 x 13))


(defn not-teen? [age]
  (complement teen?))


(defn not-teen? [age]
  (not (>= 19 age 13)))


(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (vector? x) (list? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (>= year 100)
    (divides? 400 year)
    (divides? 4 year)))

; '_______'
