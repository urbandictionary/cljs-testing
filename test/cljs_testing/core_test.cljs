(ns cljs-testing.core-test
  (:require [cljs-testing.core :as sut]
            [cljs.test :refer [deftest is testing]]))

(deftest i-should-fail
  (is (= 1 0)))

(deftest i-should-succeed
  (is (= 1 1)))
