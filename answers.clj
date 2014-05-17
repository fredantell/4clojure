

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

;; Problem 41 - Drop Every Nth Item

;; Write a function which drops every Nth item from a sequence.

(comment 
  (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
  (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
  (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
)

(comment
;; partition just the ones you want, and then use the step to skip over the one you
;; don't.  Clever.  
#(apply concat (partition-all (dec %2) %2 %))
;; More straightforward answer.  Gets ugly because sometimes the last sequence
;; does not need butlast called on it.
#(mapcat (fn [x] 
           (if (= (count x) %2)
             (butlast x)
             x)) 
         (partition-all %2 %))
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

;; Problem 43 - Reverse Interleave

;; Write a function which reverses the interleave process into x number of subsequences.

(comment 
  (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
  (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
  (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
)

(comment
  ;; One thing to notice is that this solution would break if they
  ;; had included any test cases where the length of the sequence
  ;; wasn't divisible by the number of groupings.  You could use
  ;; partition-all and you've have an odd sized sequence at the end
  ;; with less entries.  Because map stops the moment any sequences
  ;; run out of entries, it would fail.
  ;; This works though :)
 #(apply map list (partition %2 %))
)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 44 - Rotate Sequence

;; Write a function which can rotate a sequence in either direction.

(comment 
  (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
  (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
  (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
  (= (__ 1 '(:a :b :c)) '(:b :c :a))
  (= (__ -4 '(:a :b :c)) '(:c :a :b))
)

(comment 
  ;; my first attempt.. only works for positive numbers
  ;; creates a neverending cycle of the seq and then takes from the
  ;; specified index.  Breaks on (drop index ...) when index is neg
  (fn [index coll]
    (take (count coll) (drop index (cycle coll))))

  ;; rather than creating a neverending sequence, just calculates
  ;; where the cleave would happen.  Then drops, takes, and concats
  ;; to create that sequence.
  #(let [n (mod % (count %2))]
         (concat (drop n %2)
                 (take n %2)))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 45 - Intro to Iterate

;; The iterate function can be used to produce an infinite lazy sequence.

(comment
  (= __ (take 5 (iterate #(+ 3 %) 1)))
)

;; [1 4 7 10 13] 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 46 - Flipping out

;; Write a higher-order function which flips the order of the arguments of an input function.

(comment 
  (= 3 ((__ nth) 2 [1 2 3 4 5]))
  (= true ((__ >) 7 8))
  (= 4 ((__ quot) 2 8))
  (= [1 2 3] ((__ take) [1 2 3 4 5] 3))
)

(comment
  (fn [f]
    (fn [x y]
      (f y x)))
)

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

;; Problem 49 - Split a Sequence

;; Write a function which will split a sequence into two parts.
;; Special Restrictions: split-at

(comment 
  (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
  (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
  (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
)

(comment
;;equivalent answers. 2nd one is code golfed a bit.
  (fn [indx coll]
    [(take indx coll)
     (drop indx coll)])
  
  #(vector (take % %2) (drop % %2))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 51 - Advanced Destructuring

;; Here is an example of some more sophisticated destructuring.

(comment 
  (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))
)

(comment
  ;; This gets destructured to [1 2 [3 4 5]]
  ;; d is the entire collection so [a b c d] becomes:
  ;; [1 2 [3 4 5] [1 2 3 4 5]]
  [1 2 3 4 5]
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 50 - Split by Type

;; Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).

(comment 
  (= (set (#(vals (group-by type %)) [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
  (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
  (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})
)

(comment 
  #(vals (group-by type %))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 52 - Intro to Destructuring

;; Let bindings and function parameter lists support destructuring.

(comment 
  (= [2 4] (let [[a b c d e f g] (range)] __))
)

;; [c e]

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 57 - Simple Recursion

;; A recursive function is a function which calls itself. This is one of the fundamental techniques used in functional programming.

;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; '(5 4 3 2 1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 61 - Map Construction

;; Write a function which takes a vector of keys and a vector of
;; values and constructs a map from them.
;; Special Restrictions: zipmap

(comment 
  (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
  (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
  (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
)

(comment
  ;;map over the two collections to assoc them together
  ;;into works here b/c it conjoins all the items of the "from coll" together
  #(into {} (map (fn [x y] {x y}) % %2))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 62 - Re-implement Iterate

;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;; Special Restrictions: iterate

(comment 
  (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
  (= (take 100 (__ inc 0)) (take 100 (range)))
  (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))
)

(comment
  ;; reductions returns the result of each intermediate step of a reduce
  ;; here I'm re-purposing it as an iterator.
  ;; (range) is used as the coll to produce an infinite sequence to process
  ;; its actual output doesn't matter.
  (fn [f x]
    (cons x (reductions (fn [x _] (f x)) (f x) (range))))

  ;; a nicer solution is to just reproduce the source of the iterate
  ;; function itself.  cons starts the sequence with x and then
  ;; recurses by passing in the same function and (f x) for the new value.
  (fn iterate* [f x]
    (cons x (lazy-seq (iterate* f (f x)))))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 64 - Intro to Reduce

;; Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.

;; (= 15 (reduce __ [1 2 3 4 5]))
;; (=  0 (reduce __ []))
;; (=  6 (reduce __ 1 [2 3]))

;; +

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 66 - Greatest Common Divisor

;; Given two integers, write a function which returns the greatest common divisor.

(comment 
  (= (__ 2 4) 2)
  (= (__ 10 5) 5)
  (= (__ 5 7) 1)
  (= (__ 1023 858) 33)
)

(comment 
  (fn [x y]
    (apply max (filter 
                #(= 0 (rem x %) (rem y %))
                (range 1 (min (inc x) (inc y))))))
)

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

;; Problem 81 - Set Intersection

;; Write a function which returns the intersection of two sets. The
;; intersection is the sub-set of items that each set has in common.
;; Special Restrictions: intersection

(comment 
  (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
  (= (__ #{0 1 2} #{3 4 5}) #{})
  (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
)

(comment
  ;; because sets can be used as functions just pass it as a predicate
  ;; to use against each member from the 2nd collection.
  #(set (filter % %2))
  #(into #{} (filter % %2)) ;; equivalent solution
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 83 - A Half-Truth

;; Write a function which takes a variable number of booleans. Your function should return true if some of the parameters are true, but not all of the parameters are true. Otherwise your function should return false.

(comment
  (= false (__ false false))
  (= true (__ true false))
  (= false (__ true))
  (= true (__ false true false))
  (= false (__ true true true))
  (= true (__ true true true false))
)

(comment 
  (fn
    [& args]
    (= true (and 
             (some true? args)
             (some false? args))))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 90 - Cartesian Product

;; Write a function which calculates the Cartesian product of two sets.

(comment 
  (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
     #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
       ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
       ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})

  (= (__ #{1 2 3} #{4 5})
     #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

  (= 300 (count (__ (into #{} (range 10))
                    (into #{} (range 30)))))
)

(comment 
  #(into #{} (for [x % y %2]
             [x y]))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 99 - Product Digits

;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.

(comment 
  (= (__ 1 1) [1])
  (= (__ 99 9) [8 9 1])
  (= (__ 999 99) [9 8 9 0 1])
)

(comment 
  (fn [x y]       ;; 999 99
    (->> (* x y) ;; 98901
         str     ;; "98901"
         seq     ;; (\9 \8 \9 \0 \1) These chars are shifted 48 spots
         (map #(- (int %) (int \0))))) ;; Unshift to turn \9 into 9
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Problem 107 - Simple Closures

;; Lexical scope and first-class functions are two of the most basic building blocks of a functional language like Clojure. When you combine the two together, you get something very powerful called lexical closures. With these, you can exercise a great deal of control over the lifetime of your local bindings, saving their values for use later, long after the code you're running now has finished.

;; It can be hard to follow in the abstract, so let's build a simple closure. Given a positive integer n, return a function (f x) which computes x^n. Observe that the effect of this is to preserve the value of n for use outside the scope in which it is defined.

(comment
  (= 256 ((__ 2) 16),
     ((__ 8) 2))
  
  (= [1 8 27 64] (map (__ 3) [1 2 3 4]))
  (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))
)

(comment 
  (fn [n]
    (fn [x]
      (int (Math/pow x n))))
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; PROBLEM 134 - A nil key

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

;; Problem 156 - Map Defaults

;; When retrieving values from a map, you can specify default values in case the key is not found:
;; (= 2 (:foo {:bar 0, :baz 1} 2))
;;However, what if you want the map itself to contain the default values? Write a function which takes a default value and a sequence of keys and constructs a map.

(comment 
  (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})
  (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
  (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
)

(comment
  ;; two pretty similar answers I came up with.  (partial assoc {})
  ;; and (partial into {}) are doing the same thing.
  ;; I think the 2nd is much more readable.
  #(reduce 
    (fn [a b] (into a (hash-map b %))) 
    (hash-map (first %2) %)
    %2)

(fn [dft coll]
(->> (map #(assoc {} %1 dft) coll)
     (reduce #(merge %1 %2))))

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

;; Problem 166 - Comparisons

;; For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any operator but = or ≠ will work). Write a function that takes three arguments, a less than operator for the data and two items to compare. The function should return a keyword describing the relationship between the two items. The keywords for the relationship between x and y are as follows:
;; x = y → :eq
;; x > y → :gt
;; x < y → :lt

(comment 
  (= :gt (__ < 5 1))
  (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum"))
  (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))
  (= :gt (__ > 0 2))
)

(comment 
  (fn [op a b]
    (cond
     (op a b) :lt
     (op b a) :gt
     :else :eq)) 
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
