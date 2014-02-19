

;; Problem 1 - Nothing but the truth

;;This is a clojure form. Enter a value which will make the form
;evaluate to true. Don't over think it! If you are confused, see the
;getting started page. Hint: true is equal to true.

;; (= __ true)

;; true


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 2 - Simple Math

;; (= (- 10 (* 2 3)) __)

;; 4

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 3 - Intro to Strings

;; = (__ (.toUpperCase "hello world"))

;; "HELLO WORLD"

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 4 - Intro to Lists

;; Lists can be constructed with either a function or a quoted form.

;; (= (list __) '(:a :b :c))

;; :a :b :c

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 5 - Lists:conj

;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.

;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))

;; '(1 2 3 4)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 6 - Intro to Vectors

;; Vectors can be constructed several ways. You can compare them with lists.

;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; :a :b :c

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 7 - Vectors: conj

;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

;; (= __ (conj [1 2 3] 4))

;; (= __ (conj [1 2] 3 4))

;; [1 2 3 4]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 8 - Intro to Sets

;; Sets are collections of unique values.

;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; #{:a :b :c :d}

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 9 - Sets:conj

;; When operating on a set, the conj function returns a new set with one or more keys "added".

;; (= #{1 2 3 4} (conj #{1 4 3} __))

;; 2

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 10 - Intro to Maps

;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.

;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))

;; 20

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 11 Maps:conj

;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;; {:b 2}

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 12 - Intro to Sequences

;; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.

;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))

;; 3

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 13 - Sequences: rest

;; The rest function will return all the items of a sequence except the first.

;; (= __ (rest [10 20 30 40]))

;; [20 30 40]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 14 - Intro to Functions

;; Clojure has many different ways to create functions.

;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))

;; 8

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 15 - Double Down

;; Write a function which doubles a number.

;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)

;; #(* % 2)
;; (fn [x] (* x 2))
;; #((partial * 2) %)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 16 - Hello World

;; Write a function which returns a personalized greeting.

;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")

;; (fn [name] (str "Hello, " name "!"))
;; #(str "Hello, " % "!")
;; #((partial str "Hello, ") % "!")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 17 - Sequences: map

;; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.

;; (= __ (map #(+ % 5) '(1 2 3)))

;; [6 7 8]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 18 - Sequenecs: filter

;; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

;; (= __ (filter #(> % 5) '(3 4 5 6 7)))

;; [6 7]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 19 - Last Element

;; Write a function which returns the last element in a sequence.
;; Special Restrictions: last
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")

;; Low level answer that uses recursion.
;; Take the sequence and destructure into a head and tail
;; if the tail is empty, you're at the end so return the head
;; if not then recur using the tail.  Eventually you'll consume the
;; entire sequence
(comment 
  (fn [coll]
    (loop [[head & tail] coll]
      (if (empty? tail)
        head
        (recur tail))))  
)

;; You can find out how many items in the sequence using count
;; if you drop (- count 1) you'll get a seq with just one item
;; drop returns a seq, but you need a scalar. So use first.
(comment
  #(first (drop (dec count %) %))
)

(comment
  #(first (take-last 1 %))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 20 - Penultimate Element

;; Write a function which returns the second to last element from a sequence.

;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])

;; Modified my answers from the previous problem.
(comment
  (fn [coll]
    (loop [[head & tail] coll]
      (if (= 1 (count tail))
        head
        (recur tail))))

  )
(comment
  #(first (take-last 2 %))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 21 - Nth Element

;; Write a function which returns the Nth element from a sequence.
;; Special Restrictions: nth

;;test cases
(comment
  (= (__ '(4 5 6 7) 2) 6)
  (= (__ [:a :b :c] 0) :a)
  (= (__ [1 2 3 4] 1) 2)
  (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))

;;answer
(comment
  (fn [seq pos]
    (last (take (+ pos 1) seq)))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 22 - Count a Sequence

;; Write a function which returns the total number of elements in a sequence.
;; Special Restrictions: count

;;test cases
(comment 
  (= (__ '(1 2 3 3 1)) 5)
  (= (__ "Hello World") 11)
  (= (__ [[1 2] [3 4] [5 6]]) 3)
  (= (__ '(13)) 1)
  (= (__ '(:a :b :c)) 3)
)

;;answer
(comment
  #(reduce (fn [a b] (inc a)) 0 %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 23 - Reverse a Sequence

;; Write a function which reverses a sequence.
;; Special Restrictions: reverse rseq

(comment 
  (= (__ [1 2 3 4 5]) [5 4 3 2 1])
  (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
  (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
)

;;Two different answers.  The reduce seems to be what into
;;is doing under the hood if you look at the source
;; http://clojuredocs.org/clojure_core/clojure.core/into
(comment 
  #(reduce conj '() %) 
  #(into '() %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 24 - Sum It All Up

;; Write a function which returns the sum of a sequence of numbers.

(comment 
  (= (__ [1 2 3]) 6)
  (= (__ (list 0 -2 5 5)) 8)
  (= (__ #{4 2 1}) 7)
  (= (__ '(0 0 -1)) -1)
  (= (__ '(1 10 3)) 14)
)

;; #(reduce + %)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 25 - Find the Odd Numbers

;; Write a function which returns only the odd numbers from a sequence.

(comment
  (= (__ #{1 2 3 4 5}) '(1 3 5))
  (= (__ [4 2 1 6]) '(1))
  (= (__ [2 2 4 6]) '())
  (= (__ [1 1 1 3]) '(1 1 1 3))
)

(comment
  #(filter (fn [x] (= 1 (mod x 2))) %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 35 - Local Bindings

;; Clojure lets you give local names to values using the special let-form.

;; (= __ (let [x 5] (+ 2 x)))
;; (= __ (let [x 3, y 10] (- y x)))
;; (= __ (let [x 21] (let [y 3] (/ x y))))

;; 7

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; Problem 36 - Let it Be

;; Can you bind x, y, and z so that these are all true?

;; (= 10 (let __ (+ x y)))
;; (= 4 (let __ (+ y z)))
;; (= 1 (let __ z))

(comment
  [x 7 y 3 z 1]
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 37 - Regular Expressions

;; Regex patterns are supported with a special reader macro.

;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; "ABC"

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 64 - Intro to Reduce

;; Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.

;; (= 15 (reduce __ [1 2 3 4 5]))
;; (=  0 (reduce __ []))
;; (=  6 (reduce __ 1 [2 3]))

;; +

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
