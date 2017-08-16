(ns nonogram.core-test
  (:require [cljs.test :refer-macros [deftest is testing run-tests]]
            [nonogram.core]
            [doo.runner :refer-macros [doo-tests]]))

(enable-console-print!)

(doo-tests 'nonogram.core-test)

(comment
(run-tests)
)

