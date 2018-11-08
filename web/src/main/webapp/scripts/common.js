/**
 * @author
 * @see https://stackoverflow.com/questions/6615641/how-do-you-get-the-contextpath-from-javascript-the-right-way
 **/
function getContextPath() {
    return window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
}

/**
 * @author Hossein
 **/
function getHomePath() {
    return window.location.protocol + "//" + window.location.hostname + ":" + window.location.port + getContextPath();
}

/**
 * @author Hossein
 **/
function getServletOverviewPath() {
    return getHomePath() + "/servlet/servlet-overview.html";
}

function getHttpStatusCodePath() {
    return getHomePath() + "/servlet/http/httpStatusCode";
}

/**
 * sends a request to the specified url from a form. this will change the window location.
 * @param {string} path the path to send the post request to
 * @param {object} params the paramiters to add to the url
 * @param {string} [method=post] the method to use on the form
 */
function post(path, params, method) {
    method = method || "post"; // Set method to post by default if not specified.

    // The rest of this code assumes you are not using a library.
    // It can be made less wordy if you use one.
    var form = document.createElement("form");
    form.setAttribute("method", method);
    form.setAttribute("action", path);

    params.uid = Math.floor(Math.random() * Math.pow(10, 12));

    for (var key in params) {
        if (params.hasOwnProperty(key)) {
            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", key);
            hiddenField.setAttribute("value", params[key]);

            form.appendChild(hiddenField);
        }
    }

    document.body.appendChild(form);
    form.submit();
}

function goBack() {
    window.history.back();
}
