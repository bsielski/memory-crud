(ns memory-crud.static-pages.home-page)

(def index
  {:name  ::index
   :enter (fn [context]
            (assoc context :response {:body   "This is The New Home Page\n"
                                      :status 200}))})

(def routes #{["/" :get index]})
