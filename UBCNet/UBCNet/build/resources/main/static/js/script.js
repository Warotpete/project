function toggleFields() {
    const postType = document.getElementById("postType").value;

    // Hide all fields initially
    document.getElementById("announcement-fields").style.display = "none";
    document.getElementById("shop-fields").style.display = "none";
    document.getElementById("housing-fields").style.display = "none";

    // Show fields based on selected post type
    if (postType === "announcement") {
        document.getElementById("announcement-fields").style.display = "block";
    } else if (postType === "shop") {
        document.getElementById("shop-fields").style.display = "block";
    } else if (postType === "housing") {
        document.getElementById("housing-fields").style.display = "block";
    }
}

function toggleCustomCondition() {
    const condition = document.getElementById("shop-condition").value;
    const customConditionInput = document.getElementById("custom-condition");

    if (condition === "Custom") {
        customConditionInput.style.display = "block";
        customConditionInput.required = true;
    } else {
        customConditionInput.style.display = "none";
        customConditionInput.required = false;
        customConditionInput.value = ""; // Clear custom condition
    }
}
