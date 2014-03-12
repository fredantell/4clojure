

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

;; Problem 26 - Fibonacci Sequence

;; Write a function which returns the first X fibonacci numbers.
(comment 
  (= (__ 3) '(1 1 2))
  (= (__ 6) '(1 1 2 3 5 8))
  (= (__ 8) '(1 1 2 3 5 8 13 21)))

;; iterate returns a lazy sequence of all the fibonacci pairs
;; we map over them with first to get a sequence of fibonaccis
;; then we can take from our lazy sequence only as much as we need to realize
(comment
  #(take % (map first (iterate (fn [[x y]]
                        [y (+ x y)]) [1 1])))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 27 - Palindrome Detector

;; Write a function which returns true if the given sequence is a palindrome.
;;Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(comment
  (false? (__ '(1 2 3 4 5)))
  (true? (__ "racecar"))
  (true? (__ [:foo :bar :foo]))
  (true? (__ '(1 1 3 3 1 1)))
  (false? (__ '(:a :b :c)))
)

;; Took me a while to realize that while the first half = the second
;; half, the much easier solution is that the sequence is
;; identical to its reverse
(comment 
  #(= (seq %) (reverse %))

  #(let [half (int (/ (count %) 2))]
     (= 
      (take half %)
      (reverse (take-last half %))))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 28 - Flatten

;; Write a function which flattens a sequence.
;; Special Restrictions: flatten

(comment 
  (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
  (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
  (= (__ '((((:a))))) '(:a))
)

;; This is just the source to the flatten function..
;; tree seq is visiting every single node depth first
;; and appends the seq/value at that node to its return value
;; you call rest to get rid of the root node
;; then you filter it for things that are not sequences.
;; this effectively eliminates all the intermediate sequences
;; and leaves you only with the scalars left in the leaves.
;; Said more succinctly tree seq is dumping every node into a large
;; return value, which you can then filter for just the terminal nodes.
(comment
  (fn [coll] 
  (filter (complement sequential?)
          (rest (tree-seq sequential? identity coll))))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 29 - Get the Caps

;; Write a function which takes a string and returns a new string containing only the capital letters.

(comment 
  (= (__ "HeLlO, WoRlD!") "HLOWRD")
  (empty? (__ "nothing"))
  (= (__ "$#A(*&987Zf") "AZ")
)

(comment 
  #(apply str (re-seq #"[A-Z]" %))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 30 - Compress a Sequence

;; Write a function which removes consecutive duplicates from a sequence.

(comment 
  (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
  (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
  (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
)

;; partition-by splits every time the function its given returns a new value
;; In this case, all repeated values get put into a sequence together
;; From there it's easy to map over them taking the first element
(comment
  #(map first (partition-by identity %))  
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 31 - Pack a Sequence

;; Write a function which packs consecutive duplicates into sub-lists.

(comment 
  (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
  (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
  (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
)

(comment 
  #(partition-by identity %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 32 - Duplicate a Sequence

;; Write a function which duplicates each element of a sequence.

(comment 
  (= (__ [1 2 3]) '(1 1 2 2 3 3))
  (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
  (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
  (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
)

(comment
  #(reduce (fn [a b] (conj a b b)) [] %)
  #(interleave % %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 33 - Replicat a Sequence

;; Write a function which replicates each element of a sequence a variable number of times.

(comment 
  (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
  (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
  (= (__ [4 5 6] 1) '(4 5 6))
  (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
  (= (__ [44 33] 2) [44 44 33 33])
)

(comment 
  #(mapcat (fn [x] (repeat %2 x)) %)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 34 - Implement Range

;; Write a function which creates a list of all integers in a given range.
;; Special Restrictions: range

(comment 
  (= (__ 1 4) '(1 2 3))
  (= (__ -2 2) '(-2 -1 0 1))
  (= (__ 5 8) '(5 6 7))
)

(comment
  (fn [x y] (take-while #(< % y) (iterate inc x)))
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

;; Problem 38 - Maximum Value

;; Write a function which takes a variable number of parameters and returns the maximum value.
;; Special Restrictions: max max-key

(comment 
  (= (__ 1 8 3 4) 8)
  (= (__ 30 20) 30)
  (= (__ 45 67 11) 67)
)

(comment
  (fn [& args] (reduce #(if (> %1 %2) %1 %2) args))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 39 - Interleave Two Seqs

;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.

(comment 
  (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
  (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
  (= (__ [1 2 3 4] [5]) [1 5])
  (= (__ [30 20] [25 15]) [30 25 20 15])
)

(comment 
  #(mapcat list % %2)
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 40 - Interpose a Seq

;; Write a function which separates the items of a sequence by an arbitrary value.
;; Special Restrictions: interpose

(comment 
  (= (__ 0 [1 2 3]) [1 0 2 0 3])
  (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
  (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
)

(comment
(fn [interposer coll]
  (butlast (mapcat (fn [x]
            [x interposer]) coll)))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 42 - Factorial Fun

;; Write a function which calculates factorials.

(comment 
  (= (__ 1) 1)
  (= (__ 3) 6)
  (= (__ 5) 120)
  (= (__ 8) 40320)
)

(comment 
  (fn fac [x] (if (= x 1) 1 (* x (fac (dec x))))) ;; recursive solution
  #(reduce * (range 1 (inc %))) ;; alternate solution
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 45 - Intro to Iterate

;; The iterate function can be used to produce an infinite lazy sequence.

(comment
  (= __ (take 5 (iterate #(+ 3 %) 1)))
)

;; [1 4 7 10 13] 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 47 - Contain Yourself

;; The contains? function checks if a KEY is present in a given collection. This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.

(comment 
  (contains? #{4 5 6} __) ;; sets look up by membership
  (contains? [1 1 1 1 1] __) ;; vectors look up by index
  (contains? {4 :a 2 :b} __) ;; maps look up by key
  (not (contains? '(1 2 4) __)) ;; lists look up by index
)

;; 4

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 48 - Intro to Some

;; The some function takes a predicate function and a collection. It returns the first logical true value of (predicate x) where x is an item in the collection.

(comment 
  (= __ (some #{2 7 6} [5 6 7 8]))
  (= __ (some #(when (even? %) %) [5 6 7 8]))
)

;; 6

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 57 - Simple Recursion

;; A recursive function is a function which calls itself. This is one of the fundamental techniques used in functional programming.

;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; '(5 4 3 2 1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 64 - Intro to Reduce

;; Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.

;; (= 15 (reduce __ [1 2 3 4 5]))
;; (=  0 (reduce __ []))
;; (=  6 (reduce __ 1 [2 3]))

;; +

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 68 - Recurring Theme

;; Clojure only has one non-stack-consuming looping construct: recur. Either a function or a loop can be used as the recursion point. Either way, recur rebinds the bindings of the recursion point to the values it is passed. Recur must be called from the tail-position, and calling it elsewhere will result in an error.

(comment 
  (= __
     (loop [x 5
            result []]
       (if (> x 0)
         (recur (dec x) (conj result (+ 2 x)))
         result)))
)

;; [7 6 5 4 3]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 71 - Rearranging Code: ->

;; The -> macro threads an expression x through a variable number of forms. First, x is inserted as the second item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the second item in the second form, making a list of that form if necessary. This process continues for all the forms. Using -> can sometimes make your code more readable.

(comment 
  (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
     (-> [2 5 4 1 3 6] (reverse) (rest) (sort) (__))
     5)
)

;; last

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 72 - Rearranging Code: ->>

;; The ->> macro threads an expression x through a variable number of forms. First, x is inserted as the last item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the last item in the second form, making a list of that form if necessary. This process continues for all the forms. Using ->> can sometimes make your code more readable.

(comment 
  (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
     (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
     11)
)

;; This is a 3 way equality.  The first two expressions return '(5 2
;; 4) and must be transformed to equal 11, so the answer is (partial reduce +)
;; reduce +

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 134 - A nil key

;; Write a function which, given a key and map, returns true iff the map contains an entry with that key and its value is nil.

(comment 
  (true?  (__ :a {:a nil :b 2}))
  (false? (__ :b {:a nil :b 2}))
  (false? (__ :c {:a nil :b 2}))
)
(comment 
  (fn [key map]
    (and (contains? map key) (nil? (key map))))

  #(nil? (get %2 % "none")) ;; alternate solution
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 145 - For the win

;; Clojure's for macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s). It can take some time to understand how to use it properly, but that investment will be paid back with clear, concise sequence-wrangling later. With that in mind, read over these for expressions and try to see how each of them produces the same result.

;;test cases
(comment 
  (= __ (for [x (range 40)
              :when (= 1 (rem x 4))]
          x))

  (= __ (for [x (iterate #(+ 4 %) 0)
              :let [z (inc x)]
              :while (< z 40)]
          z))

  (= __ (for [[x y] (partition 2 (range 20))]
          (+ x y)))
)

;;answer
(comment
  [1 5 9 13 17 21 25 29 33 37]
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 161 - Subset and Superset

;; Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.

(comment 
  (clojure.set/superset? __ #{2})
  (clojure.set/subset? #{1} __)
  (clojure.set/superset? __ #{1 2})
  (clojure.set/subset? #{1 2} __)
)

(comment
  #{1 2}
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 162 - Logical falsity and truth

;; In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.

(comment 
  (= __ (if-not false 1 0))
  (= __ (if-not nil 1 0))
  (= __ (if true 1 0))
  (= __ (if [] 1 0))
  (= __ (if [0] 1 0))
  (= __ (if 0 1 0))
  (= __ (if 1 1 0))
)

;; 1  ;; these all equal 1

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
