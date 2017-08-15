(ns nonogram.core)

(defn make-board
  ([columns rows]
   (make-board columns rows (make-array Integer (count columns) (count rows))))

  ([columns rows grid]
   {:columns columns
   :rows rows
   :grid (array grid)
   }))


(defn verify-solution
  [board]
  "Verify that the board is properly solved"
  false)

(defn solve-board
  [board]
  "Create the solution to a board"
  false)


(def test-unsolved (make-board [[0 1] []]
            [[1 0] []]))

(def test-solved (make-board [[0 1] []]
            [[1 0] []]
            [[2 1] [2 2]]))

(verify-solution test-unsolved)
(verify-solution test-solbed)

