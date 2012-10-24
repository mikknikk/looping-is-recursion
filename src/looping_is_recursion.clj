(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc n]
                 (if (zero? n)
                   acc
                   (recur (* base acc) (dec n))))]
    (helper 1 exp)))

(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  (cond (and (empty? seq1) (empty? seq2))   true
        (not (= (first seq1) (first seq2))) false
        :else                               (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])